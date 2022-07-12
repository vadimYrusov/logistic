define(['component/listPage'], function (listPage) {
    return listPage(
        'brandList',
        'resource->/api/brand',
        [
            {id: 'name', editor: 'text'}
        ])
})