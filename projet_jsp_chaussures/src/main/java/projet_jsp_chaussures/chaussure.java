package projet_jsp_chaussures;

public class chaussure {
	private int id;
	private String description;
	private int prix;
	public chaussure (int id, String description, int prix) {
		super();
		this.id = id;
		this.description = description;
		this.prix = prix;	
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "chaussure [id=" + id + ", description=" + description + ", prix=" + prix + "]";
	}
	
}