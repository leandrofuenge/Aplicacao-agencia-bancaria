package main;

import java.util.ArrayList;
import java.util.Scanner;

//import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

import model.Pessoa;
import model.Conta;

public class AgenciaBancaria {

    private static final String CPF = null;
    private static final String Nome = null;
    private static final String Email = null;
    private static final String RG = null;
    private static final String CEP = null;
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes() {

        int operacao = Integer.parseInt(JOptionPane.showInputDialog(" --- Selecione uma operação ---" +

                "|   Opção 1 - Criar conta   |" +
                "|   Opção 2 - Depositar     |" +
                "|   Opção 3 - Sacar         |" +
                "|   Opção 4 - Transferir    |" +
                "|   Opção 5 - Listar        |" +
                "|   Opção 6 - Sair          |"));
        ;

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                transferir();
                break;

            case 5:
                listarContas();
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Obrigado por usar nossa agência");
                System.exit(0);

            default:

                JOptionPane.showMessageDialog(null, "Opção inválida");
                operacoes();
                break;
        }
    }

    public static void criarConta() {
        // System.out.println("Você está criando uma conta\n");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
        pessoa.setEmail(JOptionPane.showInputDialog("Email:"));
        pessoa.setcpf(JOptionPane.showInputDialog("CPF:"));
        pessoa.setRG(JOptionPane.showInputDialog("RG:"));
        pessoa.setCEP(JOptionPane.showInputDialog("CEP:"));

        Pessoa cliente = new Pessoa(Nome, CPF, Email, RG, CEP);

        Conta conta = new Conta(cliente);

        contasBancarias.add(conta);
        JOptionPane.showMessageDialog(null, "--- Sua conta foi criada com sucesso! ---");

        operacoes();

    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if (contasBancarias.size() > 0) {
            for (Conta contaa : contasBancarias) {
                if (contaa.getNumeroConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }

    public static void depositar() {

        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta do remetente"));

        Conta conta = encontrarConta(numeroConta);

        if (conta != null) {

            Double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
            conta.depositar(valorDeposito);
        } else {
            JOptionPane.showMessageDialog(null, "--- Conta não encontrada ---");
        }

        operacoes();

    }

    public static void sacar() {

        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta:"));
        Conta conta = encontrarConta(numeroConta);

        if (conta != null) {

            Double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja Sacar?"));
            conta.sacar(valorSaque);

        } else {
        }

        operacoes();

    }

    public static void transferir() {

        int numeroContaRemetente = Integer
                .parseInt(JOptionPane.showInputDialog("Número da conta que vai enviar a transferência"));
        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if (contaRemetente != null) {

            int numeroContaDestinatario = Integer
                    .parseInt(JOptionPane.showInputDialog("Número da conta do destinatário"));
            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null) {

                Double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da transferência"));
                contaRemetente.transferencia(contaDestinatario, valor);

            } else {
                JOptionPane.showMessageDialog(null, "--- Transferência realizada com sucesso! ---");
            }

        } else {
            JOptionPane.showMessageDialog(null, "--- Conta para transferência não encontrada ---");
        }
        operacoes();
    }

    public static void listarContas() {
        if (contasBancarias.size() > 0) {
            for (Conta conta : contasBancarias) {
                System.out.println(conta);
            }
        } else {
            JOptionPane.showMessageDialog(null, "--- Não há contas cadastradas ---");
        }

        operacoes();
    }
}