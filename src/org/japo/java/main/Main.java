/* 
Copyright 2019  Brayan C. Sanchez Arenas - brayancamilo.sanchez.alum2iescap.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Brayan C. Sanchez Arenas
 */
public class Main {
public static final Scanner SCN = 
	  new Scanner(System.in, "Windows-1252")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        try {
            //Introducción datos triangulo
            System.out.print("Base del triángulo ....:");
            double base = SCN.nextDouble();
            SCN.nextLine();
            System.out.print("Altua del triángulo ...:");
            double altura = SCN.nextDouble();
            SCN.nextLine();
            //Calculo
            double areai = base * altura / 2;
            //Resultado
            System.out.printf(Locale.ENGLISH,"Área triángulo .......:%.2f%n", areai);
        } catch (Exception e){
            System.out.println("¡Datos Incorrectos!");
            SCN.nextLine();
        }
    }
}
