package org.example.patterns.decorator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Se aplica a metodos
@Retention(RetentionPolicy.RUNTIME) // Se mantiene en tiempo de ejecucion
public @interface TransactionalSession
{

}
