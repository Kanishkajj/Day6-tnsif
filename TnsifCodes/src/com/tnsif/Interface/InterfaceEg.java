package com.tnsif.Interface;

interface Fruits{
	
	  void sour();
		
	}



	public  class InterfaceEg implements Fruits {

		public void sour() {
			System.out.println("The fruits are sour!!!"); //implementation
		}
		
		
		
		public static void main(String[] args) {
			
			
			InterfaceEg obj1 = new InterfaceEg();
			obj1.sour();

		}

	}