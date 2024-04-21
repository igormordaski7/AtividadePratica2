public class Sistema {

    private static void MostrarMenu() {

        System.out.println("\n------------ MENU - CADASTRO DE VEICULOS ------------");
        System.out.println("1) Cadastrar Carro");
        System.out.println("2) Cadastrar Moto");
        System.out.println("3) Cadastrar Caminhão");
        System.out.println("4) Buscar veículo");
        System.out.println("5) Remover veículo");
        System.out.println("6) Editar veículos");
        System.out.println("7) Lista de carros");
        System.out.println("8) Lista de motos");
        System.out.println("9) Lista de caminhões");
        System.out.println("10) Listar todos os veiculos");
        System.out.println("11) Limpar a lista de veículos");
        System.out.println("0) Sair do sistema");
        System.out.print("Informe uma opção: ");
    
    } 

    private static void selectOption (int op) {

        String marca;
        String modelo;
        int anoFabricacao;
        String placa;

        switch (op) {
            case 1:
                System.out.println("\nOPÇÃO SELECIONADA -- CADASTRAR CARRO");
                System.out.print("\nMarca: ");
                marca = Console.lerString();

                System.out.print("Modelo: ");
                modelo = Console.lerString();

                System.out.print("Ano de fabricação: ");
                anoFabricacao = Console.lerInt();

                System.out.print("Placa: ");
                placa = Console.lerString();

                System.out.print("Tipo de transmissão: ");
                String tipoTransmissao = Console.lerString();

                Carro carro = new Carro(marca, modelo, anoFabricacao, tipoTransmissao, placa);

                CadastroVeiculo.cadastrarVeiculo(carro);

                System.out.println("\nCarro cadastrado com sucesso!");
                break;

            case 2:
                System.out.println("\nOPÇÃO SELECIONADA -- CADASTRAR MOTO");
                System.out.print("\nMarca: ");
                marca = Console.lerString();

                System.out.print("Modelo: ");
                modelo = Console.lerString();

                System.out.print("Ano de fabricação: ");
                anoFabricacao = Console.lerInt();

                System.out.print("Placa: ");
                placa = Console.lerString();

                System.out.print("Cilindrada: ");
                int cilindrada = Console.lerInt();

                Moto moto = new Moto(marca, modelo, anoFabricacao, cilindrada, placa);

                CadastroVeiculo.cadastrarVeiculo(moto);

                System.out.println("\nMoto cadastrada com sucesso!");
                break;

            case 3:
                System.out.println("\nOPÇÃO SELECIONADA -- CADASTRAR CAMINHÃO");
                System.out.print("\nMarca: ");
                marca = Console.lerString();

                System.out.print("Modelo: ");
                modelo = Console.lerString();

                System.out.print("Ano de fabricação: ");
                anoFabricacao = Console.lerInt();

                System.out.print("Placa: ");
                placa = Console.lerString();

                System.out.print("Carga Maxima: ");
                double cargaMax = Console.lerFloat();

                Caminhao caminhao = new Caminhao(marca, modelo, anoFabricacao, cargaMax, placa);

                CadastroVeiculo.cadastrarVeiculo(caminhao);

                System.out.println("\nCaminhão cadastrado com sucesso!");
                break;

            case 4:
                System.out.println("\nOPÇÃO SELECIONADA -- BUSCAR VEÍCULO");

                System.out.print("\nDigite a placa do veiculo que deseja encontrar: ");
                placa = Console.lerString();

                if (CadastroVeiculo.buscarVeiculo(placa)) {
                    System.out.println("\nVeiculo da placa " + placa + " encontrado com sucesso!");
                }
                else {
                    System.out.println("\nVeiculo da placa "+ placa + " não encontrado!");
                }
                break;

            case 5:
                System.out.println("\nOPÇÃO SELECIONADA -- EXCLUIR VEÍCULO");

                System.out.print("\nDigite a placa do veiculo que deseja excluir: ");
                placa = Console.lerString();

                if (CadastroVeiculo.excluirVeiculo(placa)) {
                    System.out.println("\nVeiculo " + placa + " excluido com sucesso!");
                }
                else {
                    System.out.println("\nVeiculo " + placa + " não encontrado!");
                }
                break;

            case 6:
                System.out.println("\nOPÇÃO SELECIONADA -- EDITAR VEÍCULO");

                if (CadastroVeiculo.listVazia()) {
                    System.out.println("\nErro: A lista de veículos está vazia.");
                    break;
                }
                
                System.out.print("Insira a categoria do veículo que deseja alterar: \n(1) - Carro \n(2) - Moto \n(3) - Caminhão \nDigite: ");
                int categoria = Console.lerInt();
                System.out.print("\nDigite a placa do veiculo que deseja editar: ");
                placa = Console.lerString();

                if (!CadastroVeiculo.verificaPlaCate(categoria, placa)) {
                    System.out.println("\nErro: A categoria do veículo não corresponde à placa informada.");
                    break;
                }

                String newTipoTrans = null;
                int newCilindrada = 0;
                double newCargaMax = 0;
                
                System.out.print("\nMarca: ");
                String newMarca = Console.lerString();

                System.out.print("Modelo: ");
                String newModelo = Console.lerString();

                System.out.print("Ano de fabricação: ");
                int newAnoFabri = Console.lerInt();

                System.out.print("Placa: ");
                String newPlaca = Console.lerString();

                switch (categoria) {
                    case 1:
                        System.err.print("Tipo de transmissão: ");
                        newTipoTrans = Console.lerString();
                    break;
                    case 2:
                        System.err.print("Cilindrada: ");
                        newCilindrada = Console.lerInt();
                    break;
                
                    case 3:
                        System.err.print("Carga Máxima: ");
                        newCargaMax = Console.lerFloat();
                    break;

                    default:
                    System.out.println("Numero inválido.");
                    break;
                }

                boolean edicaoSucesso = CadastroVeiculo.editarVeiculo(placa, newMarca, newModelo, newAnoFabri, newPlaca, newTipoTrans, newCilindrada, newCargaMax);
                if (edicaoSucesso) {
                    System.out.println("\nVeiculo atualizado com sucesso!");
                } else {
                    System.out.println("\nErro: A categoria do veículo não corresponde à placa informada.");
                }
                break;

            case 7: 
                System.out.println("\nOPÇÃO SELECIONADA -- LISTA DE CARROS");
             
                for (Veiculo tempVeiculo : CadastroVeiculo.getListaVeiculos()) {
                if (tempVeiculo instanceof Carro) {
                    System.out.println(tempVeiculo);  
                    } 
                }
                if(CadastroVeiculo.getListaVeiculos().size() == 0) {
                    System.out.println("\nNenhum carro cadastrado!");
                }
                
                break;

            case 8:
                System.out.println("\nOPÇÃO SELECIONADA -- LISTA DE MOTOS");
             
                for (Veiculo tempVeiculo : CadastroVeiculo.getListaVeiculos()) {
                if (tempVeiculo instanceof Moto) {
                    System.out.println(tempVeiculo);  
                    }
                }
                if(CadastroVeiculo.getListaVeiculos().size() == 0) {
                    System.out.println("\nNenhuma moto cadastrada!");
                }
                
                break;

            case 9:
                System.out.println("\nOPÇÃO SELECIONADA -- LISTA DE CAMINHÕES");
             
                for (Veiculo tempVeiculo : CadastroVeiculo.getListaVeiculos()) {
                if (tempVeiculo instanceof Caminhao) {
                    System.out.println(tempVeiculo);  
                    }
                }
                if(CadastroVeiculo.getListaVeiculos().size() == 0) {
                    System.out.println("\nNenhum caminhão cadastrado!");
                }
                break;

            case 10:
                System.out.println("\nOPÇÃO SELECIONADA -- LISTAR TODOS OS VEÍCULOS");
                    if (CadastroVeiculo.listarVeiculo()){
                    } else{
                        System.out.println("\nNenhum veículo cadastrado");
                    }
            
                break;

            case 11:
                System.out.println("\nOPÇÃO SELECIONADA -- LIMPAR A LISTA DE VEÍCULOS");
                if (CadastroVeiculo.excluirLista()) {
                    System.out.println("\nLista de veiculos apagada com sucesso!");
                } else {
                    System.out.println("\nA lista já se encontra vazia!");
                }
                break;

            case 0:
                System.out.println("\nFinalizando o sistema........");
                break;
        
            default:
                System.out.println("\nNúmero inválido. Digite novamente");
                break;
        }
    }

    public static void executar() {

        int op;

        do {

            MostrarMenu();
            op = Console.lerInt();
            selectOption(op);

        } while (op != 0);

    }
}
