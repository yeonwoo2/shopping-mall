#  Shopping-mall

쇼핑몰 토이프로젝트

#  쇼핑몰 사용자페이지

* 백엔드에 초점을 맞춰 백엔드 개발에 주력

* 로그인과 결제 시스템 구현하는 것을 목표로 개발

* 프론트엔드와 백엔드분리(Api 서버)

###  :white_check_mark: 사용기술 및 개발환경

Java, Spring Boot, Spring Security, JPA, QueryDSL, MySQL, 

###  :white_check_mark: Application UI

자세한 사항은 :point_right: https://github.com/JeongbinYoon/admin

예시)

![캡쳐화면](https://user-images.githubusercontent.com/82079635/192253356-01c805b4-768e-47c7-b67e-ca3f3934a40e.png)

###  :white_check_mark: ERD 설계

자세한 사항은 :point_right: https://www.erdcloud.com/d/55vaBJyo3c6DmRzBp

![erd](https://user-images.githubusercontent.com/82079635/192253796-1a25c972-d84c-488c-827c-449c439a81c7.png)

###  :white_check_mark: API 설계

진행중

###  :white_check_mark: 각 기능별 Use Case

####  :file_folder: Item

* 상품은 여러개의 주문요청에 들어갈 수 있다.

* 상품은 여러개의 카테고리에만 들어갈 수 있다.

* 상품은 여러개의 옵션을 가질 수 있다.

####  :file_folder: Order

* 주문요청에는 여러개의 상품이 들어갈 수 있다.

* 주문요청에는 하나의 배송지와 결제수단이 들어간다.

####  :file_folder: User

* 회원은  주문을 여러번 할 수 있다.

###  :white_check_mark: 각 기능별 비지니스 로직

####  :file_folder: User

* 회원가입시 비밀번호는 암호화해서 DB에 저장된다.

* 로그인시 응답으로 JWT 토큰을 HTTP Header를 통해 발급해준다.

####  :file_folder: Order

진행중

####  :file_folder: Delivery

진행중