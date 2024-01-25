package com.defitech.DefiClinique.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AOPConfig {

    @AfterReturning(pointcut = "execution(* com.defitech.DefiClinique.PatientServiceImp.get*(..))", returning = "result")
    public void message(Object result) {
        log.info("Méthode exécutée. Résultat : {}", result);
    }
}
