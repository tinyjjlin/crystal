package com.tiny.crystal.support;

import java.beans.PropertyEditorSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author tiny lin
 * @date 2018/12/2
 */
public class DateEditor extends PropertyEditorSupport {
    public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void setAsText(String text) {
        setValue(parseString(text));
    }

    private Object parseString(String text) {
        Date date = null;
        if (null != text && !"".equals(text)) {
            try {
                dateTimeFormat.setLenient(false);
                date = dateTimeFormat.parse(text);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (date == null) {
                try {
                    dateFormat.setLenient(false);
                    date = dateFormat.parse(text);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return date;
    }

}
