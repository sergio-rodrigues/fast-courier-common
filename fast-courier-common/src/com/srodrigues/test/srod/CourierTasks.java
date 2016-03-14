package com.srodrigues.test.srod;
import java.io.Serializable;
import java.util.List;

public interface CourierTasks extends Serializable {
	boolean    add(final String task);
	boolean delete(final String task);
	List<String> get();
}
