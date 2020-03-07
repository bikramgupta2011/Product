# Product
Product Management

Prerequisite : install lombok, postgresql
---------------------------------------------

API:
-----------
Get All product
/product 

Get Product by id
/product/{id}

Create Product
/product/create
{ 
	"name": "Nokia 6.1",
	"brand":{
			"brandId":"....."
		},
	"expireDatecategory":{
			"cId":"---"
		},
	"price": 16000.00,
	"manufactureData":"2018-03-29"
	"expireDate":"2024-03-29"
}



Update Product
/product/update

Delete Product
/product/{id}

Get All Brand
/product/brand

Get Brand By id
/product/brand/{id}

Create Brand
/product/brand
{ 
	"name": "Nokia"
}


Get All Category
/product/category

Get CategoryBy id
/product/category/{id}

Create Category
/product/category
{ 
	"name": "Mobile"
}

