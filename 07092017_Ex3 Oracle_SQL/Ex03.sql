INSERT INTO KHACHHANG VALUES (1,'ItSol','ItSol','82 Duy Tan','itsol@gmail.com','123456789','1234');
INSERT INTO KHACHHANG VALUES (2,'ItSol','Chuyen hang','83 Duy Tan','itsol@gmail.com','123456789','1234');
INSERT INTO KHACHHANG VALUES (3,'FPT','FPT','84 Duy Tan','itsol@gmail.com','123456789','1234');
INSERT INTO KHACHHANG VALUES (4,'ItSol','Chuyen hang','85 Duy Tan','itsol@gmail.com','123456789','1234');
INSERT INTO KHACHHANG VALUES (5,'ItSol','Chuyen hang','82 Duy Tan','itsol@gmail.com','123456789','1234');

INSERT INTO NHACUNGCAP VALUES (1,'FPT','Nhan hang','82 Duy Tan','123456789','1234','itsol@gmail.com');
INSERT INTO NHACUNGCAP VALUES (3,'FSOFT','Nhan hang','82 Duy Tan','123456789','1234','itsol@gmail.com');
INSERT INTO NHACUNGCAP VALUES (2,'VIETTEL','Nhan hang','82 Duy Tan','123456789','1234','itsol@gmail.com');

INSERT INTO LOAIHANG VALUES (1,'Ung dung');
INSERT INTO LOAIHANG VALUES (2,'Thiet bi');


INSERT INTO MATHANG VALUES (1,'Phan Mem','1','1','1200','USD','1000');
INSERT INTO MATHANG VALUES (2,'Ban Ghe','2','2',1200,'USD','1000');
INSERT INTO MATHANG VALUES (3,'Day Mang','3','2',1200,'USD','1000');
INSERT INTO MATHANG VALUES (4,'Router','1','2',1200,'USD','1000');
INSERT INTO MATHANG VALUES (5,'Switch','3','2',1200,'USD','1000');

INSERT INTO NHANVIEN VALUES (1,'Do','Thuy',(To_Date('16-sep-1996')),(To_Date('05-sep-2017')),'Cau Dien','0987654321','100000','20000');
INSERT INTO NHANVIEN VALUES (2,'Do','Linh',(To_Date('16-sep-1996')),(To_Date('05-sep-2017')),'Cau Dien','0987654321','100000','20000');
INSERT INTO NHANVIEN VALUES (3,'Do','Thuy',(To_Date('16-sep-1996')),(To_Date('05-sep-2017')),'Cau Dien','0987654321','100000','20000');
INSERT INTO NHANVIEN VALUES (4,'Chu','Bach',(To_Date('16-sep-1996')),(To_Date('05-sep-2017')),'Cau Dien','0987654321','100000','20000');

INSERT INTO DONDATHANG VALUES (1,2,3,(To_date('01-sep-2017')),(To_date('30-sep-2017')),(To_date('01-October-2017')),'82 Duy Tan');
INSERT INTO DONDATHANG VALUES (2,1,1,(To_date('01-sep-2017')),(To_date('30-sep-2017')),(To_date('01-October-2017')),'82 Duy Tan');
INSERT INTO DONDATHANG VALUES (3,1,2,(To_date('01-sep-2017')),(To_date('30-sep-2017')),(To_date('01-October-2017')),'Sai Gon');
INSERT INTO DONDATHANG VALUES (4,1,4,(To_date('01-sep-2017')),(To_date('30-sep-2017')),(To_date('01-October-2017')),'Sai Gon');
INSERT INTO DONDATHANG VALUES (5,1,3,(To_date('01-sep-2017')),(To_date('30-sep-2017')),(To_date('01-October-2017')),'Sai Gon');

INSERT INTO CHITIETDATHANG VALUES (1,'1',10000,1,120000);
INSERT INTO CHITIETDATHANG VALUES (2,'2',10000,1,120000);
INSERT INTO CHITIETDATHANG VALUES (3,'3',10000,1,120000);

commit;
