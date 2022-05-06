package com.te.ess_port_application;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Execution {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		while (true) {
			System.out.println("Press 1 to register employee\nPress 2 to login\n 3 to exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Employee_info emp = new Employee_info();
				System.out.println("Enter Employee_name");
				emp.setEmployee_Name(sc.next());
				System.out.println("Enter Employee_type");
				emp.setEmployee_Type(sc.next());
				System.out.println("Enter email");
				emp.setEmail(sc.next());
				System.out.println("Enter password");
				emp.setPassword(sc.next());
				manager.persist(emp);
				transaction.begin();
				transaction.commit();
				break;
			case 2:
				int id;
				Employee_info find;
				String password;
				System.out.println("enter the id");
				    while(true) {
					id = sc.nextInt();
					find = manager.find(Employee_info.class, id);
					if (find == null) {
						System.out.println("id doesn't exist");
						System.out.println("enter valid id");
						continue;
					}
					break;
				    }
				    while(true) {
				    System.out.println("enter Password");
				    password = sc.next();
			       if(find.getPassword().equals(password)){

					if (find.getEmployee_Type().equals("manager")) {
						System.out.println(
								"press 1 to show all leave request" + "\npress 2 to Approve/Reject leave request");
						choice = sc.nextInt();
						Query createQuery = manager.createQuery("from Employee_leave");
						List<Employee_leave> resultList = createQuery.getResultList();
						switch (choice) {
						case 1:
							if (resultList != null) {
								Iterator<Employee_leave> iterator = resultList.iterator();
									System.out.println("Id\t leave_date\t Leave_status");
									while (iterator.hasNext()) {
										Employee_leave next = iterator.next();
										System.out.print(next.getEmployee_ID()+"\t");
										System.out.print(next.getLeave_Date()+"\t");
										System.out.println(next.getLeave_Status());
									}
								

							} else {
								System.out.println("no request has arrived");
							}
							break;
						case 2:for(Employee_leave s:resultList) {
							if(s.getLeave_Status().equals("pending")) {
							  // int flag=(int)(Math.random()*(3-1))+1;//can do like this
								 int flag=(int)(Math.random()*2+1);
								 if(flag==1)
									 s.setLeave_Status("approved");
								 else
									 s.setLeave_Status("Rejected");
								     }
							
							manager.persist(s);
							transaction.begin();
							transaction.commit();
						}
							
							break;
						}

					}
					else
					{
						System.out.println("press 1 to show all status of leave requests\npress 2 to request for a leave");
						choice=sc.nextInt();
						switch(choice) {
						case 1:Query query = manager.createQuery("from Employee_leave where Employee_ID=:i");
						query.setParameter("i",id);
						List<Employee_leave>resultList = query.getResultList();
						Iterator<Employee_leave> iterator = resultList.iterator();
						System.out.println("================LEAVE REQUEST============");
						System.out.println("******************employee_id="+id+"*********************");
						System.out.println("leave_date\t Leave_status");
						while (iterator.hasNext()) {
							Employee_leave next = iterator.next();
							System.out.print(next.getLeave_Date()+"   \t");
							System.out.println(next.getLeave_Status());
						}
						break;
						case 2:Employee_leave empl=new Employee_leave();
						System.out.println("enter leavedate");
						String str=sc.next();
						empl.setEmployee_ID(id);
						empl.setLeave_Date(str);
						empl.setLeave_Status("pending");
						manager.persist(empl);
						transaction.begin();
						transaction.commit();
					}
						}
					break;
			}
			    else {
			    	System.out.println("enter valild password");
			    }
				    }
				break;
			case 3:return;
			}
			
		}
		}
}
