/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.system_van;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno.cyber
 */
public class System_Van {

    public static void main(String[] args) {
        int a, i = 0, id, id_procura;
        Scanner sc = new Scanner(System.in);
        ArrayList<BancoGenerico>listaBanco = new ArrayList<>();
        BancoGenerico<Cliente> cliente = new BancoGenerico<>(new Cliente());
        BancoGenerico<Van> van = new BancoGenerico<>(new Van());
        BancoGenerico<Viagem> viagem = new BancoGenerico<>(new Viagem());
        
        
        
        //adicionar dados no banco de dados
        do{ 
            //Endereço dos dados na lista
            System.out.println("id da viagem");
            viagem.objeto.id = sc.nextInt();

            //add van
            System.out.println("DADOS DA VAN\n");
            van.objeto.id = viagem.objeto.id;
            System.out.println("km da van: ");
            van.objeto.Km = sc.nextInt();
            System.out.println("Quantidade de bancos: ");
            van.objeto.bancos =  sc.nextInt();
            System.out.println("Estado de manutenção: ");
            van.objeto.manutencao = sc.next();
                
            listaBanco.add(van);
                
            //add viagem
            System.out.println("____________________________________________________\n");
            System.out.println("DADOS DA VIAGEM\n");
            
            System.out.println("Nome do Gerente: ");
            viagem.objeto.gerente = sc.next();
            System.out.println("Nome do motorista: ");
            viagem.objeto.motorista = sc.next();
            System.out.println("Cidade de partida: ");
            viagem.objeto.partida = sc.next();
            System.out.println("Cidade destino: ");
            viagem.objeto.destino = sc.next();
            
            //add dados da viagem
            listaBanco.add(viagem);
            
            System.out.println("____________________________________________________\n");
            System.out.println("DADOS DO(S) CLIENTE(S)\n");
            while(i==0){
                cliente.objeto.id = viagem.objeto.id;
                System.out.println("Digite o nome: ");
                cliente.objeto.nome = sc.next();
                System.out.println("Digite o CPF: ");
                cliente.objeto.CPF = sc.nextInt();
                System.out.println("Digite RG: ");
                cliente.objeto.RG = sc.nextInt();
                System.out.println("Insira o e-mail ");
                cliente.objeto.email = sc.next();
                System.out.println("Insira o endereço: ");
                cliente.objeto.endereco = sc.next();
                System.out.println("Insira o número do telefone: ");
                cliente.objeto.tel = sc.nextInt();

                //add dados do cliente na lista
                listaBanco.add(cliente);

                System.out.println("Deseja adicionar mais um cliente a essa viagem?\n sim-0 | não-1\n");
                i = sc.nextInt();
            }
        System.out.println("Desenja add mais uma viagem?\n sim-0 | não-1\n");
        a = sc.nextInt();
        }while(a==0);
        
        a= 0;
        
        
        // Realizar pesquisas no banco de dados
        while(a==0){
            System.out.println("Digite código da viagem a ser pesquisada: \n");        
            id_procura =sc.nextInt();


            for(BancoGenerico<Viagem> b: listaBanco){
                if (id_procura == b.objeto.id){
                    System.out.println("DADOS DA VIAGEM\n");
                    System.out.println("Nome do gerente: "+viagem.objeto.gerente);
                    System.out.println("Nome do motorista: "+viagem.objeto.gerente);
                    System.out.println("Local de partida: "+viagem.objeto.partida);
                    System.out.println("Local de destino: "+viagem.objeto.destino);
                    System.out.println("______________________________________________________\n");

                }
            }
        
            for(BancoGenerico<Van> b :listaBanco){
                if (id_procura == b.objeto.id){
                    System.out.println("DADOS DA VAN\n");
                    System.out.println("KM: "+van.objeto.Km);
                    System.out.println("Manutenção: "+van.objeto.manutencao);
                    System.out.println("Bancos: "+van.objeto.bancos);
                    System.out.println("______________________________________________________\n");

                }
            }

            for(BancoGenerico<Cliente> b :listaBanco){
                if (id_procura == b.objeto.id){ 
                    System.out.println("DADOS DO CLIENTE\n");
                    System.out.println("nome cliente: " +cliente.objeto.nome);
                    System.out.println("CPF: " +cliente.objeto.CPF);
                    System.out.println("RG: " +cliente.objeto.RG);
                    System.out.println("e-mail: "+cliente.objeto.email);
                    System.out.println("Endereço: " +cliente.objeto.endereco);
                    System.out.println("Telefone: " +cliente.objeto.tel);
                    System.out.println("______________________________________________________\n");
                } 
            }
        System.out.println("Deseja fazer mais uma pesquisa? 0-sim | 1-Não");
        a=sc.nextInt();
        }
    }
}

