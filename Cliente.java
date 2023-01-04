public class Cliente
{
    private int nif;
    private String nome;
    private String endereco;
    
    private List<Servico> lista;
    public Cliente(int nif, String n, String e)
    {
        this.nif = nif;
        this.nome = n;
        this.endereco = e;
        this.lista = new ArrayList<Servico>();
    }

    public int getNIF()
    {   return this.nif;}
    
    public void setNIF(int n)
    {   this.nif = n;}
    
    public String getNome()
    {   return this.nome;}
    
    public void setNome(String n)
    {   this.nome = n;}
    
    public String getEndereco()
    {   return this.endereco;}
    
    public void setEndereco(String e)
    {   this.endereco = e;}
    
    public List<Servico> getLista(){
        ArrayList<Servico> temp = new ArrayList<Servico>();
        for(Servico s:this.servicos)
            temp.add(s);
        
        return temp;
    }
    public Cliente clone()
    {   Cliente c = new Cliente(this.getNIF(), this.getNome(), this.getEndereco());
        for(Servico s:this.lista)
            c.add(s);
     
        return c;
    }
    
    public boolean equals(Cliente c)
    {
        if(c!=null)
            return(this.nif == c.getNIF());
        else
            return false;
    }
}
