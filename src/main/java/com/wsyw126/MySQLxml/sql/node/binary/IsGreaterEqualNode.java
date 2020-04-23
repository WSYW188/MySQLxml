package com.wsyw126.MySQLxml.sql.node.binary;

import com.wsyw126.MySQLxml.config.SimpleSQLRuntimeSetting;
import com.wsyw126.MySQLxml.sql.SQLNodeType;
import com.wsyw126.MySQLxml.utils.CompareUtil;

import java.util.Map;

/**
 * @author xinzhi
 */
public class IsGreaterEqualNode extends BinaryNode {

    protected IsGreaterEqualNode() {
        super(SQLNodeType.IsGreaterEqual);
    }

    @Override
    protected boolean isConditionSatisfied(Map<String, Object> para,
                                           SimpleSQLRuntimeSetting runtimeSetting) {
        Object propertyObject = para.get(getProperty());
        Object compareObject = runtimeSetting.interpret(
                propertyObject.getClass(), getCompareValue());
        return CompareUtil.compare(propertyObject, compareObject) >= 0;
    }
}
