import java.util.List;

public interface AnimalDAO {

	void adicionar(Animal a);

	void atualizar(long id, Animal a);

	void adicionar(long id);

	List<Animal> adicionar(String nome);

}
