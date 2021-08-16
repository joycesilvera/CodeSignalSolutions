/*
You’ve created a meal plan for the next few days, and prepared a list of products that you’ll need as ingredients for each day’s meal. There are many shops around you that sell the products you’re looking for, but you only have time to visit one or two stores each day.

Given the following information, your task is to find the minimum cost you’ll need to spend on each meal:

cntProducts - an integer representing the total number of products you’ll be using in all of your meals;
quantities - a rectangular matrix of integers, where quantities[I][j] represents the amount of product j available in shop I;
costs - a rectangular matrix of integers, where costs[I][j] represents the cost of buying product j from shop I;
meals - a rectangular matrix of integers, where meals[m][j] represents the amount of product j required to make the mth meal.
Return an array of length meals.length representing the minimum cost of each meal (assuming you can only visit up to two shops each day).

NOTE:

You only like to use fresh ingredients, so you’ll need to buy new products from the shops each day (you may not use leftovers from a previous day).
Each store re-stocks their merchandise every night, so the amounts in the quantities array are available each day.
It’s guaranteed that it will always be possible to buy all the products needed for each meal by visiting only one or two shops.
Example

For cntProducts = 2,
quantities = [[1, 3], 
              [2, 1], 
              [1, 3]]
costs = [[2, 4],
         [5, 2],
         [4, 1]]
and

meals = [[1, 1],
         [2, 2],
         [3, 4]]
the output should be choosingShops(cntProducts, quantities, costs, meals) = [3, 8, 19].

There are 3 shops and 2 products in total.

To cook the first meal you need to buy one product 0 and one product 1. The most optimal way is to buy them in the first and third shops respectively: buying one product 0 in the first shop costs 2 * 1 = 2 and buying one product 1 in the third shop costs 1 * 1 = 1. So you pay 2 + 1 = 3 units of money for this meal.
To cook the second meal you need to buy two of product 0 and two of product 1. The optimal way is to buy one product 0 in the first shop, and then buy one product 0 and two product 1s in the third shop. This way, you spend (1 * 2) + (1 * 4 + 2 * 1) = 8 units of money.
To cook the third meal you need to buy three of product 0 and four of product 1. The optimal way is to buy two product 0s and one product 1 in the second shop, and then buy one product 0 and three product 1s in the third shop. This way, you spend (2 * 5 + 1 * 2) + (1 * 4 + 3 * 1) = 19 units of money.



cntProducts: 2
quantities:
[[1,3], 
 [2,1], 
 [1,3]]
costs:
[[2,4], 
 [5,2], 
 [4,1]]
meals:
[[1,1], 
 [2,2], 
 [3,4]]
Expected Output: [3,8,19]



cntProducts: 3
quantities:
[[2,4,1], 
 [5,2,0]]
costs:
[[4,4,1], 
 [1,2,3]]
meals:
[[3,2,1], 
 [7,3,0], 
 [4,2,1], 
 [3,6,0]]
Expected Output:

8,21,9,23

*/
