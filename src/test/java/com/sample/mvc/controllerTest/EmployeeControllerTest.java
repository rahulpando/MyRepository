/*package com.sample.mvc.controllerTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.sample.mvc.dao.EmployeeDAO;
import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeService;




@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {
		 "classpath:test-context.xml",
		"classpath:WEB-INF/employee-servlet.xml"})
@Transactional
public class EmployeeControllerTest {
	
	
	@Autowired
	EmployeeService employeeService1;
	@Test
	public void addTest()
	{
		String name="vikas" ,city="Ruchi";
		int code=100 ;
//		System.out.println(code);
		EmployeeCommand employee=(EmployeeCommand) employeeService.listContact();
		String name1=employee.getName(),city1=employee.getCity();
		int code1=employee.getCode();
		System.out.println(code1);
		assertEquals(name, name1);
		assertEquals(city, city1);
		assertEquals(code, code1);
	}
	private MockMvc mockMvc;
	 
    @Autowired
    private EmployeeService employeeService;;
    
    @Test
    public void findAll_ShouldAddTodoEntriesToModelAndRenderTodoListView() throws Exception {
        Todo first = new TodoBuilder()
                .id(1L)
                .description("Lorem ipsum")
                .title("Foo")
                .build();`
 
        Todo second = new TodoBuilder()
                .id(2L)
                .description("Lorem ipsum")
                .title("Bar")
                .build();
 
        when(todoServiceMock.findAll()).thenReturn(Arrays.asList(first, second));
    }
}*/

/*package com.sample.mvc.controllerTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeControllerTest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8090/EMS_HibernateTP/add.jsp";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCheck() throws Exception {
		driver.get(baseUrl + "");
	    driver.findElement(By.name("code")).clear();
	    driver.findElement(By.name("code")).sendKeys("112");
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Rahul");
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("Pune");
	    driver.findElement(By.id("SubmitEmployee")).click();

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
*/