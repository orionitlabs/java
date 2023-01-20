package class5.sri;

public class Student implements MandatoryCourses, Project {
    private String course1, course2, course3;
    private String projectId, topic;

    @Override
    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    @Override
    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    @Override
    public void setCourse3(String course3) {
        this.course3 = course3;
    }

    @Override
    public String getCourse1() {
        return this.course1;
    }

    @Override
    public String getCourse2() {
        return this.course2;
    }

    @Override
    public String getCourse3() {
        return this.course3;
    }

    @Override
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String getProjectId() {
        return this.projectId;
    }

    @Override
    public String getTopic() {
        return this.topic;
    }
}
