package zh.ata.kz.model;

/**
 * Created by j_igo on 20.11.2019.
 */
public class Prereq {
    private String course_id;
    private String prereq_id;

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
}
