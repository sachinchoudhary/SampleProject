package com.sample



fun main(args: Array<String>) {
   val x:Int = 5
   when (x) {
      1 -> print("x = = 1")
      2 -> print("x = = 2")
      
      else -> { // Note the block
         print("x is neither 1 nor 2")
      }
   }
	
	firstLoop@ for(y in 1..2){
	myLabel@ for(x in 1..10) { // appling the custom label
      if(x == 5) {
         println("I am inside if block with value"+x+"\n-- hence it will close the operation")
         break@firstLoop //specifing the label
      } else {
         println("I am inside else block with value"+x)
         continue@myLabel
      }
	 }
	}
}