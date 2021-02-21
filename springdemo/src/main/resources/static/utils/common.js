/**
 * [初始化图表]
 * @author xiaojie
 * @param elementId [id名称]
 * @param options [初始化参数]
 * @param width [宽度]
 * @param height [高度]
 * @return [返回值]
 * @date 2021/2/1 15:45
 */
function chartLineMap(elementId, width, height, options) {
    $('#' + elementId).css({
        'width': width,
        'height': height
    });
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById(elementId));
    myChart.setOption(options);
}


