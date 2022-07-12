define(['component/listPage', 'collections/brands'], function (listPage, brands) {
    return listPage(
        'modelList',
        'resource->/api/model',
        [
            {id: 'name', editor: 'text'},
            {id: 'brand', editor: 'combo', options: brands}
        ])
})