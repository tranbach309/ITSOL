-- 1.Hãy cho biet có nhung khách hàng nào lai chính là doi tác cung cap hàng cua công ty (tuc là có cùng tên giao dich).
select khachhang.tencongty, khachhang.diachi
from khachhang inner join nhacungcap on khachhang.tengiaodich = nhacungcap.tengiaodich;

--2.Nhung don dat hàng nào yêu cau giao hàng ngay tai cty dat hàng và nhung don dó là cua công ty nào?
select khachhang.tencongty, khachhang.diachi
from khachhang inner join dondathang on khachhang.diachi = dondathang.noigiaohang;

-- 3.Nhung mat hàng nào chua tung duoc khách hàng dat mua?
select mahang, tenhang
from mathang
where not exists (select mahang from chitietdathang where mathang.mahang = chitietdathang.mahang);

--4.Nhung nhân viên nào cua công ty chua t?ng lap bat ky mot hoá don dat hàng nào?
select manhanvien, ho, ten
from nhanvien
where not exists (select manhanvien from dondathang where dondathang.manhanvien = nhanvien.manhanvien);

--5. Trong nam 2003, nhung mat hàng nào chi duoc dat mua dúng mot lan
select mathang.mahang, mathang.tenhang
from mathang inner join chitietdathang on mathang.mahang = chitietdathang.mahang inner join dondathang on chitietdathang.sohoadon = dondathang.sohoadon
where year(dondathang.ngaydathang) = 2013;

select * from dondathang;
--6 Hãy cho bi?t m?i m?t khách hàng ?ã ph?i b? ra bao nhiêu ti?n ?? ??t mua hàng c?a công ty?
select khachhang.makhachhang, khachhang.tencongty, sum(chitietdathang.giaban*chitietdathang.soluong) sotienbora
from khachhang inner join dondathang on khachhang.makhachhang = dondathang.makhachhang inner join chitietdathang on dondathang.sohoadon = chitietdathang.sohoadon
group by khachhang.makhachhang, khachhang.tencongty

--7. Moi mot nhân viên cua công ty dã lap bao nhiêu don dat hàng (neu nhân viên chua he lap mot hoá don nào thì cho ket qua là 0)
select nhanvien.manhanvien, nhanvien.ten, count(dondathang.sohoadon) sohoadon
from nhanvien left join dondathang on nhanvien.manhanvien = dondathang.manhanvien
group by nhanvien.manhanvien, nhanvien.ten;

--8.  Cho bi?t t?ng s? ti?n hàng mà c?a hàng thu ???c trong m?i tháng c?a n?m 2003 (th?i ???c gian tính theo ngày ??t hàng). 

--9. Hãy cho biet tong so luong hàng cua moi mot hàng mà cty dã có (tong so luong hàng hien có và dã bán).
select mathang.mahang, tenhang, mathang.soluong + 
  case 
    when sum(chitietdathang.soluong) is null  then 0  
    else sum(chitietdathang.soluong)
    end as tongsoluong
from mathang left join chitietdathang on mathang.mahang = chitietdathang.mahang
group by mathang.mahang, tenhang, mathang.soluong;

--10.  Nhân viên nào c?a cty bán ???c s? l??ng hàng nhi?u nh?t và s? l??ng hàng bán ???c c?a nhân viên này là bao nhiêu?
select nhanvien.manhanvien, nhanvien.ten, sum(chitietdathang.soluong) tongsoluonghang
from nhanvien inner join dondathang on nhanvien.manhanvien = dondathang.manhanvien inner join chitietdathang on dondathang.sohoadon = chitietdathang.sohoadon
group by nhanvien.manhanvien, nhanvien.ten;

--11.  M?i m?t ??n ??t hàng ??t mua nh?ng m?t hàng nào và t?ng s? ti?n mà m?i ??n ??t hàng ph?i tr? là bao nhiêu?
select chitietdathang.sohoadon, mathang.tenhang, sum(chitietdathang.giaban*chitietdathang.soluong) tongsotien
from chitietdathang inner join mathang on chitietdathang.mahang = mathang.mahang
group by chitietdathang.sohoadon, mathang.tenhang;

--12.  Hãy cho bi?t m?i m?t lo?i hàng bao g?m nh?ng m?t hàng nào, t?ng s? l??ng hàng c?a m?i lo?i và t?ng s? l??ng c?a t?t c? các m?t hàng hi?n có trong công ty là bao nhiêu?
select loaihang.maloaihang, loaihang.tenloaihang, sum(soluong) tongluonghang
from loaihang inner join mathang on loaihang.maloaihang = mathang.maloaihang
group by loaihang.maloaihang, loaihang.tenloaihang;

--14.  C?p nh?t l?i giá tr? NGAYCHUYENHANG c?a nh?ng b?n ghi có giá tr? NGAYCHUYENHANG ch?a xác ??nh (NULL) trong b?ng DONDATHANG b?ng v?i giá tr? c?a tr??ng NGAYDATHANG.
update dondathang
set ngaychuyenhang = ngaydathang
where ngaychuyenhang is null;

--15.  C?p nh?t giá tr? c?a tr??ng NOIGIAOHANG trong b?ng DONDATHANG b?ng ??a ch? c?a khách hàng ??i v?i nh?ng ??n ??t hàng ch?a xác ??nh ???c n?i giao hàng (có giá tr? tr??ng NOIGIAOHANG b?ng NULL)
update dondathang
set noigiaohang = diachi
from khachhang
where dondathang.makhachhang = khachhang.makhachhang and dondathang.noigiaohang is null;



