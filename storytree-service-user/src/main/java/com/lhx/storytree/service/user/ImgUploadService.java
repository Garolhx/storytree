package com.lhx.storytree.service.user;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class ImgUploadService {
    public Map<String, Object> imgUpload(MultipartFile file, String path) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        String srcFileName = file.getOriginalFilename();
        String savePath = "/static/uploadFile" + path;
        if (file != null && srcFileName != null && srcFileName.length()>0) {

            String prefix = srcFileName.substring(0, srcFileName.lastIndexOf("."));
            String suffix = srcFileName.substring(srcFileName.lastIndexOf("."), srcFileName.length());

            String newFileName = prefix + System.currentTimeMillis() + suffix;

            //相对路径
            String relativePath = savePath + "/" + newFileName;
            File newFile = new File(relativePath);
            //绝对路径
            String absolutePath = "D:/study/GraduationProject/storytree/storytree-service-user/target/classes" + relativePath;
            File newAbsoluteFile = new File(absolutePath);
            try {
                FileUtils.copyInputStreamToFile(file.getInputStream(),newAbsoluteFile);
                file.transferTo(newAbsoluteFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            resultMap.put("success", srcFileName + "上传成功");
            resultMap.put("relativePath", relativePath);
            resultMap.put("absolutePath", absolutePath);
            return resultMap;
        }else {
            resultMap.put("error", srcFileName + "上传失败");
            return resultMap;
        }
    }
}
