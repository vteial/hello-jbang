///usr/bin/env jbang "$0" "$@" ; exit $?

//DEPS org.projectlombok:lombok:1.18.24
//DEPS org.slf4j:slf4j-api:1.7.36
//DEPS org.slf4j:slf4j-simple:1.7.36

import static java.lang.System.*;
import lombok.Builder;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
public class N2NJq {

    public static void main(String... args) {
        N2NJq object = new N2NJq();
        try {
            object.run();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


    void run() throws Exception {
        log.info("------------------------------------");

        List<ConditionConfig> ccs = new ArrayList<>();

        String jqQuery = this.computeJQ(ccs);
        log.info("JQ Query : {}", jqQuery);

        log.info("------------------------------------");
    }

    String computeJQ(List<ConditionConfig> ccs) {
        StringBuilder jqQuery = new StringBuilder("jq '");

        for(ConditionConfig cc : ccs) {
            
        }

        jqQuery.append("'");
        return jqQuery.toString();
    }
}

@Builder
@Data
class ConditionConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String uuid;

    private Integer status;

    private String conditionConfigurationId;

    private Integer ruleType;

    private Integer ruleOrder;

    private Integer group;

    // private Operator conditionWithPrecedingGroup;

    private Integer order;

    // private Operator conditionWithPrecedingSibling;

    private Integer conditionOperator;

    private Integer conditionKeyId;

    // private FieldType conditionType;

    private Integer conditionOnType;

    private String conditionValue;

    // private FieldType conditionFieldType;

    private Integer conditionFieldId;

    private String conditionKeyStepId;

    private String conditionFieldStepId;

    private Integer createdBy;

    private Date createdDate;

    private Integer updatedBy;

    private Date updatedDate;

    public String toString() {
        return ruleType + ":" + ruleOrder + ":" + group +  ":" + order;
    }

}
