define(function () {
    var ajax  = webix.ajax().headers({
        'Content-type' : 'application/json'
    })
    webix.proxy.resource = {
        init:function(){
            webix.extend(this, webix.proxy.rest);
        },
        load:function(view, params) {
            return ajax.get('api/brand').then(function (value) {
                return value.json().content
            })
        },
        save:function(view, params){
            return
        }
    }
})