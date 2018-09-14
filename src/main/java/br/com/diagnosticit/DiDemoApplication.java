package br.com.diagnosticit;

import br.com.diagnosticit.controller.ContructorInjectedController;
import br.com.diagnosticit.controller.GetterInjectedController;
import br.com.diagnosticit.controller.MyController;
import br.com.diagnosticit.controller.PropertyInjectedController;
import br.com.diagnosticit.exemplobeans.FakeDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
            
            ApplicationContext ctx  = SpringApplication.run(DiDemoApplication.class, args);
            MyController controller = (MyController) ctx.getBean("myController");
            
            FakeDataSource fds = (FakeDataSource) ctx.getBean( "fakeDataSource" );
            System.out.println(fds);
	}

        
	
    
}
