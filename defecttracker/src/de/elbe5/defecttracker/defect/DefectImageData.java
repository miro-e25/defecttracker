package de.elbe5.defecttracker.defect;

import de.elbe5.content.ContentData;
import de.elbe5.file.FileBean;
import de.elbe5.file.ImageData;
import de.elbe5.request.ApiRequestData;
import de.elbe5.request.SessionRequestData;
import org.json.simple.JSONObject;

import java.util.Locale;

public class DefectImageData extends ImageData {

    public static int MAX_IMAGE_WIDTH = 1024;

    public DefectImageData(){
        setMaxWidth(MAX_IMAGE_WIDTH);
    }

    @SuppressWarnings("unchecked")
    public JSONObject getJson(Locale locale){
        JSONObject json = new JSONObject();
        json.put("id",getId());
        json.put("fileName",getFileName());
        json.put("contentType",getContentType());
        json.put("displayName",getDisplayName());
        return json;
    }
}
