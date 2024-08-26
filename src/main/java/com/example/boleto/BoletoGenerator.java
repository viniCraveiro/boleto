//package com.example.boleto;
//
//
//public class BoletoGenerator {
//
//    public void gerarBoletoPDF() {
//        try (ACBrBoleto acbrBoleto = new ACBrBoleto()) {
//
//            // Configura o banco
//            acbrBoleto.setBanco(Banco.bradesco);
//
//            // Configura o cedente
//            acbrBoleto.getCedente().setNome("Nome do Cedente");
//            acbrBoleto.getCedente().setCNPJ("00.000.000/0000-00");
//
//            // Configura o sacado
//            Sacado sacado = new Sacado();
//            sacado.setNome("Nome do Sacado");
//            sacado.setCNPJCPF("000.000.000-00");
//            acbrBoleto.getSacado().add(sacado);
//
//            // Configura o boleto
//            Boleto boleto = new Boleto();
//            boleto.setVencimento("31/12/2024");
//            boleto.setValor(150.00);
//            boleto.setNossoNumero("123456789");
//
//            // Adiciona o boleto ao ACBrBoleto
//            acbrBoleto.getBoletos().add(boleto);
//
//            // Define o caminho onde o PDF será salvo
//            String caminhoPDF = "/caminho/para/salvar/boleto.pdf";
//
//            // Gera o PDF do boleto
//            acbrBoleto.ImprimirBoletoPDF(caminhoPDF);
//
//            System.out.println("Boleto gerado com sucesso em: " + caminhoPDF);
//        } catch (ACBrException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
