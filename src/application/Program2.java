package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById =====");
		Department Department = DepartmentDao.findById(3);
		System.out.println(Department);

		System.out.println("\n=== TEST 2: Department findAll =====");
		List <Department> list = DepartmentDao.findAll();
		list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: Department insert =====");
		Department newDepartment = new Department(null, "Teste");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: Department update =====");
		Department = DepartmentDao.findById(4);
		Department.setName("Tech");
		DepartmentDao.update(Department);

        System.out.println("\n=== TEST 5: Department delete =====");
        DepartmentDao.deleteById(7);
		System.out.println("Delete completed");


		sc.close();
    }
    
}
