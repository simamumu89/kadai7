# GET　リクエスト

curl --location 'http://localhost:8080/patient'

# POST リクエスト

curl --location 'http://localhost:8080/patient' \
--header 'Content-Type: application/json' \
--data '{
"address" : "沖縄県",
"insurancecard" : "国保"
}
'

# PATCH　リクエスト

curl --location --request PATCH 'http://localhost:8080/patient/7' \
--header 'Content-Type: application/json' \
--data '{
"address" : "千葉県",
"insurancecard" : "協会"
}
'

# DELETE　リクエスト

curl --location --request DELETE 'http://localhost:8080/patient/7' \
--header 'Content-Type: application/json' \
--data '{
"id" : "2"
}
'

動作確認　

# GET リクエスト
![9A5A37A3-2911-405A-89BD-81575043361A_1_105_c.jpeg](..%2F..%2F..%2F..%2F..%2F..%2F..%2FPictures%2F%E5%86%99%E7%9C%9F%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AA.photoslibrary%2Fresources%2Fderivatives%2F9%2F9A5A37A3-2911-405A-89BD-81575043361A_1_105_c.jpeg)

# POST　リクエスト
![CA49128E-4B58-4678-97A9-2AA0C9FB9CF8_1_105_c.jpeg](..%2F..%2F..%2F..%2F..%2F..%2F..%2FPictures%2F%E5%86%99%E7%9C%9F%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AA.photoslibrary%2Fresources%2Fderivatives%2FC%2FCA49128E-4B58-4678-97A9-2AA0C9FB9CF8_1_105_c.jpeg)

# PATCH リクエスト
![C5D409F4-5F22-4051-B0C3-8CA5084A4F6E_1_105_c.jpeg](..%2F..%2F..%2F..%2F..%2F..%2F..%2FPictures%2F%E5%86%99%E7%9C%9F%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AA.photoslibrary%2Fresources%2Fderivatives%2FC%2FC5D409F4-5F22-4051-B0C3-8CA5084A4F6E_1_105_c.jpeg)

# DELETE　リクエスト
![51C5C85C-1D67-4CB4-8B4C-95642BA97E75.jpeg](..%2F..%2F..%2F..%2F..%2F..%2F..%2FPictures%2F%E5%86%99%E7%9C%9F%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AA.photoslibrary%2Foriginals%2F5%2F51C5C85C-1D67-4CB4-8B4C-95642BA97E75.jpeg)
