		package com.example.manytoooneDemo;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.ApplicationContext;



		@SpringBootApplication
		public class DemomanytooneApplication {

			public static void main(String[] args) {
				
				
				
				ApplicationContext context;
				context=SpringApplication.run(DemomanytooneApplication.class, args);
				CartRepository cart;  
				cart=context.getBean(CartRepository.class);
				ItemsRepository items;
				items=context.getBean(ItemsRepository.class);
				
				
//				Role r1=new Role(1,"Admin");
//				role.save(r1);
//				Emp e1=new Emp(100,"abc",r1);
//				emp.save(e1);
				
//				(int cart_id, String uname, Set<Item> items)
				
				Cart c1=new Cart(1,"abc" );
				cart.save(c1);
				Items e1=new Items(100,"mouse",200,c1);
				items.save(e1);
				//Items e2=new Items(101,"keyboard",800,c1);
				//items.save(e2);
			}	
	}


