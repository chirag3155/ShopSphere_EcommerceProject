# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

Technologies Used 
1. Spring Boot (REST APIS)
I have developed an E-commerce project using Spring Boot 3 and Spring Security 6.


2. React JS (Frontend)
3. MySQL for Database
4. Maven for project management
5. Bootstrap (Styling)

User Modules in E-Commerce Project
The project basically has four user modules:


1) ADMIN MODULE
2) SELLER MODULE
3) CUSTOMER MODULE
4) DELIVERY MODULE

Functional Modules in E-Commerce Multi-Vendor Project
1) User Authentication Module: 
The registration and Login system has been added so that only authenticated users (Admin, Seller, Delivery, or Customer) can perform their functionalities. For authentication, we have used Spring Security 6 and JWT.
                                              
2) Seller Module: 
Register Seller, Seller Login, View All Sellers, Delete Seller.


3) Product Category Module: 
Add Category, Update Category, View All Category, Delete Category.


4) Product Module: 
Add Product, Update Product, View All Products, Search Products by Category, Search Products by Seller, Search By Product Name, Delete Product.


5) Cart Module: 
Add Product to Cart, View Cart, Update Cart, Delete Product from Cart.


6) Order Module: 
Order Products, View Customer Orders, View Seller Orders, and View All Orders.


7) Delivery Person Module: 
Register Delivery Person for Seller, View Delivery Persons, Delete Delivery Person.


8) Order Delivery Module: 
Assign Delivery to Delivery Person, View Delivery Person's Order Delivery, Update Order Delivery Status, View Updated Order Status.


OVERVIEW
The E-Commerce Multi-Vendor Shopping Project using Spring Boot and React JS contains 4 modules i.e. Admin, Seller, Delivery, and Customer. Admin can log into the system and add the product categories for which Sellers can add the products. Sellers can register and log into the system, and after login, they can add their delivery persons, can add the products to the system. Now When a customer visits the website for the very first time, he will be able to see the complete products which was added by the seller. Customers can search the products by name, category & seller. 
But now since the customer is not logged in to the system, he will not be able to add the products into the cart. After login customer can add the products into the cart. After adding, he can edit the quantity, can delete the cart. After this customer can order the products, after the order we get a unique Order ID.
Once the Customer orders the products, the Seller can see the customer's orders and assign their delivery person for the order delivery to the customer. Once a delivery person is assigned for the delivery, the Delivery Person can log into the system and now he will be able to see the delivery orders that are assigned to him by the seller. And now he can update the Order status at any time. After the Delivery, he can update the delivery time and status as "Delivered". And Now customer can see the updated delivery status of their Orders.
In the end, the Admin can see the complete details about Sellers, Delivery Persons, Customers, Products, and orders.


ROLES OF USER
1) Admin will be able to log in to the System.
When we successfully run our spring boot application, it automatically creates a default Admin with the credential "demo.admin@demo.com" as the email and "123456" password. So by using this, the admin can log in to the system.

By using the below form, All users (Admin, Seller, Delivery & Customer) can log into the system by selecting the user role.
				
2) Admin can register other admins.
After the Admin login, the admin can register Admins into the system by using the below form.

3) Admin can add Product Categories
Admin can add multiple categories into the system and Sellers can add the products from these categories only.

4) Admin can view and delete the sellers
Admin can view all the registered sellers in the system and at any time admin can delete the seller by clicking on the delete button. Once the admin deletes the seller, all products added by the seller will also get deleted and delivery persons of that seller will also get deactivated from the system.

5) The Admin can view all the delivery persons from all the sellers.
Admin can view all the registered delivery persons from all the sellers.

6) Admin can view all the products.
Admin can view all the products from all the sellers.

7) Admin can view and delete the product categories
Admin can view all the product categories added by him and he can delete the categories by clicking on the delete button. Once Admin deletes the category, all the products under that category from all sellers will also get deleted.

8) Admin can update the Category.
Admin can update the Category by below form.

9) Admin can view all the Customer orders.
Admin can view all the customer orders from all the sellers, he can also search the orders by order ID as shown below.

10) Admin can view all the Customers.
Admin can view all the registered customers in the system.


SELLER ROLE
1) Seller can register himself by using the below form.

2) Seller can register the Delivery Person by using the below form.

3) Seller can add his product
The seller can add his products to the system by the below form.

4) Seller can view all his products
The seller can view all the products which were added to him and by clicking on the delete button he can also delete the product.

5) Seller can update his product.
The seller can update any of his products at any time.

6) Seller can view and delete Delivery Persons.
The seller can view all the delivery persons which was registered by him and at any time he can delete the delivery persons.

7) Seller can view all his orders.
The seller can view all the customer orders of his products as shown.

8) Seller can assign a delivery person for an order.
The seller can assign a delivery person for the customer's orders.



CUSTOMER ROLE
1) Customer can register himself by using the below form

2) Customers can search for products by name.

3) Customers can search products by category as shown below.

4) Customers can add products to their cart.
Customers can view product details and add the products to the cart. And here customers will be able to see the product reviews by other customers.

5) Customers can view their cart.
Customer can view the products in their cart, they can increase or decrease the product quantity of products or simply they can delete the product from the cart, and below they will be able to see the total cart amount as shown below.


After clicking on the checkout button, it will get redirected to the dummy payment page.

After entering the details, when the customer clicks on the Pay button, the Product will get ordered and we will get a Unique Order ID also all the products from the cart will get deleted.


6) Customers can view their orders.
Customers can view all ordered products along with the delivery status as shown below.



DELIVERY PERSON ROLE
1) The Delivery Person can view Delivery Orders assigned to him
Delivery Person can view all the delivery orders assigned to them by the seller as shown below.

2) The Delivery Person can update the Delivery Status of Orders.
The delivery Person can update the Delivery Status of the orders that were assigned to him by the seller. and the same status will be visible to all i.e. Admin, Customer (who made orders), and Seller.
