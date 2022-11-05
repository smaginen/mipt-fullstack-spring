package com.smagin.mipt.fullstack.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Auditing {
	//Before transfer service
	@Before("execution(* com.smagin.mipt.fullstack.aspects.service.TransferService.transfer(..))") 
	public void validate(){
        System.out.println("bank validate your credentials before amount transferring");
    }
	//Before transfer service
	@Before("execution(* com.smagin.mipt.fullstack.aspects.service.TransferService.transfer(..))") 
	public void transferInstantiate(){
        System.out.println("bank instantiate your amount transferring");
    }
	//After transfer service
	@AfterReturning("execution(* com.smagin.mipt.fullstack.aspects.service.TransferService.transfer(..))")
	public void success(){
        System.out.println("bank successfully transferred amount");
    }
	//After failed transfer service
	@AfterThrowing("execution(* com.smagin.mipt.fullstack.aspects.service.TransferService.transfer(..))")
	public void rollback() {
        System.out.println("bank rolled back your transferred amount");
    }
}
