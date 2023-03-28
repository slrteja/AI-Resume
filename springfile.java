import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {
    @PostMapping("/generate-resume")
    public String generateResume(@RequestBody ResumeRequest request) {
        String prompt = String.format("Name: %s\nEmail: %s\nPhone: %s\nWork Experience:\n%s\nEducation:\n%s\nSkills:\n%s\n",
                request.getName(), request.getEmail(), request.getPhone(), request.getWorkExperience(), request.getEducation(), request.getSkills());
        String resumeText = generateResume(prompt);
        return resumeText;
    }
}
