package javarodeio;

public class Contas {
		
		int numero;
		private double saldo;	
		
		private static int valorAleatorio = 1; // Vai manter as alterações
		
		void setSaque(double valor) {
			
			if(valor <= this.saldo) {
				this.saldo -= valor;
			}else {
				System.out.println("Não Possui Saldo");
			}
		}
		double getSaldo() {
			
			return this.saldo;
					
		}
		
		void setDeposita(double deposita) {
			this.saldo += deposita;
		}
		
		public void setNumeroAleatorio() {
			this.numero = valorAleatorio;
			valorAleatorio++;
			
		}
		
			
		

	}


