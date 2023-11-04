package ru.vedeshkin.hw4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vedeshkin.hw4.util.DateTimeUtil;

import javax.validation.constraints.*;
import javax.validation.constraints.NotBlank;
import java.text.ParseException;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;
    private Systems systemName;

    @NotBlank
    private String systemTime;
    private String source;

    @Min(1)
    @Max(100_000)
    private int communicationId;

    private int templateId;
    private int productCode;
    private int snsCode;

    public long calculateElapsedTime() {
        try {
            Date endTime = new Date();
            Date startTime = DateTimeUtil.getCustomFormat().parse(systemTime);
            return endTime.getTime() - startTime.getTime();
        } catch (ParseException e) {
            return 0L;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", snsCode=" + snsCode +
                '}';
    }
}
