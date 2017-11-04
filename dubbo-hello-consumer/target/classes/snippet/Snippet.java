package snippet;

public class Snippet {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String testSay(@RequestParam(value = "name", defaultValue = "") String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("Dubbo: ").append(testService.sayHello(name));
		return sb.toString();
	}
}

