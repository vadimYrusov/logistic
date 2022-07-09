define(function () {
    return {
        view:"datatable",
        columns:[
            { id:"id"},
            { id:"name"}
        ],
        url: 'resource->/api/brand',
        autoheight: true,
        autowidth: true
    }
})