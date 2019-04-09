public class ContaXPTOPlus extends ContaXPTO {
	
	@Override
	public void Creditar(double valor){
		this.saldo = saldo + valor + (valor * 0.5);
	}
	public String toString (){
       	return getNome();
    }
    public int toString (){
       	return getNumConta();
    }
    public String toString (){
       	return getNome();
    }


}