
package Trabalho01;



import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Gabriel Estevam
 */
public class Competidores {
    Random aleatorio = new Random();
    
    //LinkedList<String> competidores = new LinkedList<String>();
    LinkedList<Double> lista = new LinkedList<Double>();
    LinkedList<Double> lista2 = new LinkedList<Double>();    
    LinkedList<Double> lista3 = new LinkedList<Double>();  
    
   
    
    public List GerarTempos1(){
        
         
        for (int i = 0; i < 24; i++) { //ADICIONA 24 TEMPOS ALEATÓRIO A LISTA1
            double tempoAleatorio = aleatorio.nextDouble()*10; // FOI MULTIPLICADO POR 10 PARA TRAZER MAIS REALIDADE AOS NÚMEROS APRESENTADOS
            
            lista.add(tempoAleatorio);
            
        }
        Collections.sort(lista); //ORDENA A LISTA EM ORDEM CRESCENTE
        System.out.println("Ordenando a lista:");
        for(int i = 0; i != 24; i++){
                     System.out.println(i+1+"°");
             
                     System.out.println("TEMPO: "+lista.get(i));
                     System.out.println("-------------------------------------------");
                    }  
               
        return null;
        
    }
     public List GerarTempos2(){
        
         System.out.println("NOVA RODADA, AGORA APENAS OS 17 MELHORES TEMPOS DA RODADA ANTERIOR: ");
         System.out.println("++++++++++++++++++++++++++++++++++++++++++");
         System.out.println(" ");
        for (int i = 0; i < 17;) { //VERIFICA OS 17 PRIMEIROS VALORES DA PRIMEIRA LISTA
            double tempoAleatorio = aleatorio.nextDouble()*10;
            
            System.out.println("NOVO TEMPO: "+tempoAleatorio);
            System.out.println("TEMPO TENTATIVA ANTERIOR: "+lista.get(i));
            
            if(tempoAleatorio > lista.get(i)){// VERIFICA SE O NOVO TEMPO ALEATÓRIO E MAIOR QUE O DA MESMA POSIÇÃO DA LISTA ANTERIOR
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                lista2.add(lista.get(i)); //SE É MAIOR ENTÃO OS VALORES NÃO SÃO ALTERADOS, COM ISSO ADICIONA NA LISTA2 O VALOR DA RODADA ANTERIOR
                
                i++;
                
            }else if(tempoAleatorio < lista.get(i)){ //VERIFICA SE O NOVO TEMPO E MENOR DO QUE O DA LISTA ANTERIOR.
                      lista2.add(tempoAleatorio); // SE O TEMPO E MENOR ENTÃO ELE SERÁ ADICIONADO NA LISTA2
                      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                     
                     i++;
                         
                         
                         
                         
                       }
                    
                    
                    
            }
            
                    Collections.sort(lista2); // APÓS A GERAÇÃO E VERIFICAÇÃO E INSERÇÃO DOS 17 VALORES, ORDENAMOS A LISTA 2 EM ORDEM CRESCENTE
                    for(int i2 = 0; i2 != 17; i2++){ // PRINTAMOS NA TELA TODOS OS VALORES DA LISTA 2
                     System.out.println(i2+1+"°");
             
                     System.out.println("TEMPO: "+lista.get(i2));
                     System.out.println("-------------------------------------------");
                    }  
        
     return null;
     }
     
     public List GerarTempos3(){ //VERIFICA-SE AGORA AS 10 PRIMEIRAS POSIÇÕES DA LISTA 2, E O PROCESSO SE REPETE COMO NO GerarTempos2.
        
         System.out.println("NOVA RODADA, AGORA APENAS OS 10 MELHORES TEMPOS DA RODADA ANTERIOR: ");
         System.out.println("++++++++++++++++++++++++++++++++++++++++++");
         System.out.println(" ");
        for (int i = 0; i < 10;) {
            double tempoAleatorio = aleatorio.nextDouble()*10;
            
            System.out.println("NOVO TEMPO: "+tempoAleatorio);
            System.out.println("TEMPO TENTATIVA ANTERIOR: "+lista2.get(i));
            
            if(tempoAleatorio > lista2.get(i)){
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                lista3.add(lista.get(i));
                i++;
                
            }else if(tempoAleatorio < lista2.get(i)){ 
                      lista3.add(tempoAleatorio);
                      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                     i++;
                         
                         
                       
                         
                       }
                    
                    
                    
            }
            
                    Collections.sort(lista3);
                    for(int i3 = 0; i3 != 10; i3++){
                     System.out.println(i3+1+"°");
             
                     System.out.println("TEMPO: "+lista.get(i3));
                     System.out.println("-------------------------------------------");
                    }  
        
     return null;
     }
    
         
     }

     

   
   
   
