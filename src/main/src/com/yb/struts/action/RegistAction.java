package com.yb.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.BufferedInputStream;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/9/28
 * Time: 9:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class RegistAction extends ActionSupport{
    private String name;
    private Integer age;
    private File photo;
    //���ܵ��ļ����ƣ���file��+FileName �ļ�����
    private String photoFileName;
    //���ܵ��ļ�����ͬ��
    private String photoContentType;

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String regist(){
        System.out.println(name+" : "+age);
        String dir=ServletActionContext.getServletContext().getRealPath("/upload");
        String ext=photoFileName.substring(photoFileName.lastIndexOf("."));
        long l=System.currentTimeMillis();
        File dir1=new File(dir);
        if(!dir1.exists())
            dir1.mkdirs();
        File newFile=new File(dir,l+ext);
        System.out.println(photo.renameTo(newFile));
        return "success";
    }

//    @SkipValidation
    public String toRegist(){
        return "toregist";
    }
//    ʹ�����У��ķ�����1.����@SkipValidation ����У���ע��
//                     2.��ǰ׺validate-  validateDo-
//                     3.�ڶ�Ӧ�������ļ��� actions����
//                <interceptor-ref name="defaultStack">
//                      <param name="validation.excludeMethods">input,back,cancel,browse,toRegist</param>
//                </interceptor-ref>
    @Override
    public void validate(){
        if (name==null||name.length()==0){
            addFieldError("name","�û�������Ϊ��");
        }
    }
}