import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	private long id;
	private String nome;
	private Date nascimento;
	private float peso;

	public Animal(long id, String nome, Date nascimento, float peso) {

		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.peso = peso;

	}

	public void setId(long id) {

		this.id = id;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void setNascimento(Date nascimento) {

		this.nascimento = nascimento;

	}

	public void setPeso(float peso) {

		this.peso = peso;

	}

	public long getId() {

		return id;

	}

	public String getNome() {

		return nome;

	}

	public Date getNascimento() {

		return nascimento;

	}

	public float getPeso() {

		return peso;

	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("Nome: " + getNome() + "\n");
		sb.append("ID: " + getId() + "\n");
		return sb.toString();

	}

}
