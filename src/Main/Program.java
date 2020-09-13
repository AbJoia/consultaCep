package Main;

import Entity.Endereco;
import Exception.CepInexistenteException;
import Exception.CepInvalidoException;
import Service.ConsultaCep;
import Tela.Telas;

public class Program {

	public static void main(String[] args) {

		try {
			ConsultaCep api = new ConsultaCep();
			String[] dadosBusca = api.buscaEnderecoPorCepApi(Telas.inicial());

			if (api.cepExistente(dadosBusca)) {
				Endereco end = new Endereco(dadosBusca[0], dadosBusca[1], dadosBusca[2], dadosBusca[3], dadosBusca[4],
						dadosBusca[5]);
				System.out.println(end.toString());
			} else {
				throw new CepInexistenteException("Cep Inexistente!");
			}

		} catch (CepInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(
					"Não foi possivel concluir a consulta! Cep deve ter oito (8) numeros, não incluir traços, espaços ou letras.");
		} catch (CepInexistenteException e) {
			System.out.println(e.getMessage());
		}

		Telas.opcao();
	}
}
