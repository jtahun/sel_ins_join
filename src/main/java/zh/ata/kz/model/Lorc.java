package zh.ata.kz.model;

/**
 * Created by Jtahun on 21.11.2019.
 */
public class Lorc {
    private String course_id;
    private String prereq_id;
    //private String course__id;
    private String title;
    private String dept_name;
    private Integer credits;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getPrereq_id() {
        return prereq_id;
    }

    public void setPrereq_id(String prereq_id) {
        this.prereq_id = prereq_id;
    }

  // public String getCourse__id() {       return course__id;    }

  // public void setCourse__id(String course__id) {
  //     this.course__id = course__id;
  // }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
}
