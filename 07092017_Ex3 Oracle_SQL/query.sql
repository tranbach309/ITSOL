-- 1.H�y cho biet c� nhung kh�ch h�ng n�o lai ch�nh l� doi t�c cung cap h�ng cua c�ng ty (tuc l� c� c�ng t�n giao dich).
select khachhang.tencongty, khachhang.diachi
from khachhang inner join nhacungcap on khachhang.tengiaodich = nhacungcap.tengiaodich;

--2.Nhung don dat h�ng n�o y�u cau giao h�ng ngay tai cty dat h�ng v� nhung don d� l� cua c�ng ty n�o?
select khachhang.tencongty, khachhang.diachi
from khachhang inner join dondathang on khachhang.diachi = dondathang.noigiaohang;

-- 3.Nhung mat h�ng n�o chua tung duoc kh�ch h�ng dat mua?
select mahang, tenhang
from mathang
where not exists (select mahang from chitietdathang where mathang.mahang = chitietdathang.mahang);

--4.Nhung nh�n vi�n n�o cua c�ng ty chua t?ng lap bat ky mot ho� don dat h�ng n�o?
select manhanvien, ho, ten
from nhanvien
where not exists (select manhanvien from dondathang where dondathang.manhanvien = nhanvien.manhanvien);

--5. Trong nam 2003, nhung mat h�ng n�o chi duoc dat mua d�ng mot lan
select mathang.mahang, mathang.tenhang
from mathang inner join chitietdathang on mathang.mahang = chitietdathang.mahang inner join dondathang on chitietdathang.sohoadon = dondathang.sohoadon
where year(dondathang.ngaydathang) = 2013;

select * from dondathang;
--6 H�y cho bi?t m?i m?t kh�ch h�ng ?� ph?i b? ra bao nhi�u ti?n ?? ??t mua h�ng c?a c�ng ty?
select khachhang.makhachhang, khachhang.tencongty, sum(chitietdathang.giaban*chitietdathang.soluong) sotienbora
from khachhang inner join dondathang on khachhang.makhachhang = dondathang.makhachhang inner join chitietdathang on dondathang.sohoadon = chitietdathang.sohoadon
group by khachhang.makhachhang, khachhang.tencongty

--7. Moi mot nh�n vi�n cua c�ng ty d� lap bao nhi�u don dat h�ng (neu nh�n vi�n chua he lap mot ho� don n�o th� cho ket qua l� 0)
select nhanvien.manhanvien, nhanvien.ten, count(dondathang.sohoadon) sohoadon
from nhanvien left join dondathang on nhanvien.manhanvien = dondathang.manhanvien
group by nhanvien.manhanvien, nhanvien.ten;

--8.  Cho bi?t t?ng s? ti?n h�ng m� c?a h�ng thu ???c trong m?i th�ng c?a n?m 2003 (th?i ???c gian t�nh theo ng�y ??t h�ng). 

--9. H�y cho biet tong so luong h�ng cua moi mot h�ng m� cty d� c� (tong so luong h�ng hien c� v� d� b�n).
select mathang.mahang, tenhang, mathang.soluong + 
  case 
    when sum(chitietdathang.soluong) is null  then 0  
    else sum(chitietdathang.soluong)
    end as tongsoluong
from mathang left join chitietdathang on mathang.mahang = chitietdathang.mahang
group by mathang.mahang, tenhang, mathang.soluong;

--10.  Nh�n vi�n n�o c?a cty b�n ???c s? l??ng h�ng nhi?u nh?t v� s? l??ng h�ng b�n ???c c?a nh�n vi�n n�y l� bao nhi�u?
select nhanvien.manhanvien, nhanvien.ten, sum(chitietdathang.soluong) tongsoluonghang
from nhanvien inner join dondathang on nhanvien.manhanvien = dondathang.manhanvien inner join chitietdathang on dondathang.sohoadon = chitietdathang.sohoadon
group by nhanvien.manhanvien, nhanvien.ten;

--11.  M?i m?t ??n ??t h�ng ??t mua nh?ng m?t h�ng n�o v� t?ng s? ti?n m� m?i ??n ??t h�ng ph?i tr? l� bao nhi�u?
select chitietdathang.sohoadon, mathang.tenhang, sum(chitietdathang.giaban*chitietdathang.soluong) tongsotien
from chitietdathang inner join mathang on chitietdathang.mahang = mathang.mahang
group by chitietdathang.sohoadon, mathang.tenhang;

--12.  H�y cho bi?t m?i m?t lo?i h�ng bao g?m nh?ng m?t h�ng n�o, t?ng s? l??ng h�ng c?a m?i lo?i v� t?ng s? l??ng c?a t?t c? c�c m?t h�ng hi?n c� trong c�ng ty l� bao nhi�u?
select loaihang.maloaihang, loaihang.tenloaihang, sum(soluong) tongluonghang
from loaihang inner join mathang on loaihang.maloaihang = mathang.maloaihang
group by loaihang.maloaihang, loaihang.tenloaihang;

--14.  C?p nh?t l?i gi� tr? NGAYCHUYENHANG c?a nh?ng b?n ghi c� gi� tr? NGAYCHUYENHANG ch?a x�c ??nh (NULL) trong b?ng DONDATHANG b?ng v?i gi� tr? c?a tr??ng NGAYDATHANG.
update dondathang
set ngaychuyenhang = ngaydathang
where ngaychuyenhang is null;

--15.  C?p nh?t gi� tr? c?a tr??ng NOIGIAOHANG trong b?ng DONDATHANG b?ng ??a ch? c?a kh�ch h�ng ??i v?i nh?ng ??n ??t h�ng ch?a x�c ??nh ???c n?i giao h�ng (c� gi� tr? tr??ng NOIGIAOHANG b?ng NULL)
update dondathang
set noigiaohang = diachi
from khachhang
where dondathang.makhachhang = khachhang.makhachhang and dondathang.noigiaohang is null;



