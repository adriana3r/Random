/*Automáticamente, de forma aleatoria, cada jugador deberá dar un golpe por turno
que irá descontando la vida del contrincante.
Ganará el jugador que no llegue a la vida en cero. 
Tantos los turnos como los golpes deberán ser anunciado por pantalla round a round,
así como el ganador.
 */

/**
 *
 * @author adriana3r
 */

import javax.swing.JOptionPane;
import java.util.Random;


public class Principal {
    
    
        public static void main(String[] args) {
    
            
        Jugador j1 = new Jugador();
                j1.setNombre("TESEO");
                j1.setVida(100);
                j1.setMinPower(13);
                j1.setMaxPower(33);
                
        Jugador j2 = new Jugador();
                j2.setNombre("MINOTAURO");
                j2.setVida(100);
                j2.setMinPower(10);
                j2.setMaxPower(35);        
                
                              
                int contador = 0;
                int cnt1 = 100;
                int cnt2 = 100;
                
                
         
        while (cnt1> 0 && cnt2 > 0) {
                contador = contador+1;
                JOptionPane.showMessageDialog(null,"ROUND NRO " + contador);         
                    
        Random aleatorio = new Random();    
                int n = aleatorio.nextInt(2)+1;
                System.out.println("Jugador nro " + n);
                
                        
        if (n == 1){
                        
                        JOptionPane.showMessageDialog(null,"Es el turno de " + j1.getNombre());
                        
                        
                                
        Random seleccion = new Random();    
                int n1 = seleccion.nextInt(2)+1;
                System.out.println("Nivel de poder " + n1);                        
                
                
                        if (n1 ==2 ){            
                                if(j2.getVida()  > 0);
                                        cnt2 = cnt2 - j2.getMaxPower();
                                        JOptionPane.showMessageDialog(null,"Nivel de poder " + n1 + " __ MÁXIMO (- 35)");
                                        
                                if (cnt2 <= -1){
                                        JOptionPane.showMessageDialog(null,j2.getNombre() + " agotó sus vidas");
                                }else{
                                        JOptionPane.showMessageDialog(null,"A " + j2.getNombre() + " le quedan " + cnt2 + " vidas");
                                        }
                        }else{            
                                cnt2 = cnt2 - j2.getMinPower();
                                JOptionPane.showMessageDialog(null,"Nivel de poder " + n1 + " __ MÍNIMO  (- 10)");
                                
                                if (cnt2 <= -1){
                                        JOptionPane.showMessageDialog(null,j2.getNombre() + " agotó sus vidas");
                                }else{
                                        JOptionPane.showMessageDialog(null,"A " + j2.getNombre() + " le quedan " + cnt2 + " vidas");       
                                        }
                                }
                        
                        if(cnt2 <= -1){
                        JOptionPane.showMessageDialog(null,"EL GANADOR ES " + j1.getNombre());
                        }
        }else{
                                           
                        JOptionPane.showMessageDialog(null,"Es el turno de " + j2.getNombre());
                        
        Random seleccion = new Random();    
                int n1 = seleccion.nextInt(2)+1;
                System.out.println("Nivel de poder " + n1);        
                                    
                        if (n1 ==2){            
                                if(j1.getVida()  > 0);
                                        cnt1 = cnt1 - j1.getMaxPower();
                                        JOptionPane.showMessageDialog(null,"Nivel de poder " + n1 + " __ MÁXIMO  (- 33)");
                                        
                                if (cnt1 <= -1){
                                        JOptionPane.showMessageDialog(null,j1.getNombre() + " agotó sus vidas");
                                }else{
                                        JOptionPane.showMessageDialog(null,"A " + j1.getNombre() + " le quedan " + cnt1 + " vidas");
                                        }
                        }else{            
                                cnt1 = cnt1 - j1.getMinPower();
                                JOptionPane.showMessageDialog(null,"Nivel de poder " + n1 + " __ MÍNIMO  (- 13)");
                                
                                if (cnt1 <= -1){
                                        JOptionPane.showMessageDialog(null,j1.getNombre() + " agotó sus vidas");
                                }else{
                                        JOptionPane.showMessageDialog(null,"A " + j1.getNombre() + " le quedan " + cnt1 + " vidas");       
                                        }
                                }
                        
        }                  
                        if(cnt1 <= 0){
                        JOptionPane.showMessageDialog(null,"EL GANADOR ES " + j2.getNombre());
                        
                                }
                        }
                }
        }

