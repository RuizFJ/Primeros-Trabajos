package Practicas26_03;

import java.util.Scanner;

public class Axel {

	public static void main(String[] args) {
		
		 Scanner x=new Scanner(System.in);
		 double ing,inganu,ing10,ing15=0,ing20 = 0,tot10,tot15,tot20,sumainss=0,ingresoanual;
	        do{
	            System.out.println("Digite sus ingresos mensuales");
	            ing=x.nextDouble();


	        }while(ing<4800 || ing>500000);
            sumainss=ing*0.07;
	        inganu= ing-sumainss;
	        ingresoanual= inganu*12;

System.out.println(ingresoanual);
	        if(ingresoanual>100000 && ingresoanual<200000){
	            ing10=ingresoanual*0.1;
	            tot10=ingresoanual-ing10;
	          System.out.println("Sus ingresos totales anuales son de :"+tot10);
	        }else{
	            if(ingresoanual>200001 && ingresoanual<300000){
	                ing15=ingresoanual*0.15;
	                tot15=ingresoanual-ing15;
	            System.out.println("Sus ingresos totales anuales son de :"+tot15);
	            }else{
	                if(ingresoanual>300001)
	            ing20=ingresoanual*0.2;
	                tot20 =ingresoanual-ing20;
	            System.out.println("Sus ingresos totales anuales son de :"+tot20);
	            }
	        }


	}

}
