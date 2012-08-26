package ${packageName}.common;

import java.util.List;

public interface Repository<Model> {

	void save(Model model);
	
	Model load(Long id);

	void update(Model model);

	void delete(Model model);
	
	List<Model> listAll();
}
