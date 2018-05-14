import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "animal")

@ViewScoped

public class AnimalController {

	@ManagedProperty(value = "#{a}")

	private Animal a = new Animal(0, null, null, 0);

	public void adicionar(Animal a) {
		AnimalDAOImplementation d = new AnimalDAOImplementation();
		d.adicionar(a);
	}

	public void remover() {
		// TODO Auto-generated method stub
	}

	public void pesquisar() {
		// TODO Auto-generated method stub
	}

	public void atualizar() {
		// TODO Auto-generated method stub
	}
}
