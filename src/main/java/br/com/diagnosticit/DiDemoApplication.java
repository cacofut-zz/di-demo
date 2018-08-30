package br.com.diagnosticit;

import br.com.diagnosticit.controller.MyController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
            
            ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
            MyController controller = (MyController) ctx.getBean("myController");
            controller.hello();

            Pessoa p1  = new PessoaFisica("Cristiano", 50000.00, 2000.00);
            Pessoa pj1 = new PessoaJuridica( "Uninove", 400000.00, 25 );
            
            List<Pessoa> list = new ArrayList<>();
            list.add( p1 );
            list.add( pj1 );
            
            list.forEach( p -> System.err.println(p) );
            
           
	}

        
	
    
}
