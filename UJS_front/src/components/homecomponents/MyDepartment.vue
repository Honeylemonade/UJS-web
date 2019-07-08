<template>
    <div class="card bg-light h-100">
        <div class="card-header">
            <form class="form-inline justify-content-center">
                <input v-model="content" class="form-control form-control-sm mr-2 my-1" type="search" placeholder="部门名称"
                       aria-label="Search">
                <button class="btn  btn-sm btn-outline-success my-1" type="button">Search</button>
            </form>
        </div>
        <table class="table table-sm text-center">
            <thead>
            <tr>
                <th scope="col">部门</th>
                <th scope="col">联系方式</th>
            </tr>
            </thead>
            <tbody>
            <tr v-bind:key="conformItem.name" v-show="index<7"
                v-for="(conformItem,index) in conformItems">
                <td>{{conformItem.name}}</td>
                <td>TEL:{{conformItem.phone}}</td>
            </tr>
            </tbody>
        </table>

    </div>
</template>

<script>
    export default {
        name: "MyDepartment",
        data: function () {
            return {
                //123个部门联系方式
                departments: [
                    {name: '综合办公室', phone: '88780122'},
                    {name: '人力资源管理科', phone: '88791204'},
                    {name: '财务与资产管理科', phone: '88780123'},
                    {name: '综合计划科', phone: '88791562'},
                    {name: '采供管理科', phone: '88797163'},
                    {name: '能源管理科', phone: '88791368'},
                    {name: '安全与质量监管科', phone: '88780238'},
                    {name: '校园管理科', phone: '88797589'},
                    {name: '饮食服务中心', phone: '88791871'},
                    {name: '公寓服务中心', phone: '88780054'},
                    {name: '物业服务中心', phone: '88791342'},
                    {name: '运输服务中心', phone: '88780130'},
                    {name: '修缮服务中心', phone: '88791313'},
                    {name: '绿化卫生中心', phone: '88791838'},
                    {name: '经营服务中心', phone: '88780233'},
                    {name: '幼儿园', phone: '88780067'},
                    {name: '一食堂', phone: '88780141'},
                    {name: '二食堂', phone: '88780142'},
                    {name: '三食堂', phone: '88780143'},
                    {name: '四食堂', phone: '88791079'},
                    {name: '西山美食城', phone: '13921585159'},
                    {name: '六食堂', phone: '88792611'},
                    {name: '风华苑', phone: '15605280212'},
                    {name: '东山美食城', phone: '15906209429'},
                    {name: '梦溪食堂', phone: '84444079'},
                    {name: '北固食堂', phone: '85038490'},
                    {name: '卤菜房', phone: '88780145'},
                    {name: '交通订车', phone: '88780130'},
                    {name: '会议中心', phone: '88797506'},
                    {name: '花卉服务', phone: '88790617'},
                    {name: '江大纪念品', phone: '15862982148'},
                    {name: '印刷服务', phone: '88780852'},
                    {name: '水电维修', phone: '88780133'},
                    {name: '五金、木工维修', phone: '88791313'},
                    {name: '梦溪校区维修班', phone: '84444178'},
                    {name: '北固校区维修班', phone: '85038531'},
                    {name: '校本部收发室', phone: '88780126'},
                    {name: '梦溪校区收发室', phone: '84444138'},
                    {name: '北固校区综合楼', phone: '85038013'},
                    {name: '行政一号楼值班室', phone: '88792578'},
                    {name: '行政二号楼值班室', phone: '88797836'},
                    {name: '一区物业管理办公室', phone: '88791990'},
                    {name: '主楼值班室', phone: '88780231'},
                    {name: '主A楼值班室', phone: '88791052'},
                    {name: '综合楼值班室', phone: '88797038'},
                    {name: '食品楼值班室', phone: '88797352'},
                    {name: '二区物业管理办公室', phone: '88780116'},
                    {name: '汽车,能动大楼值班室', phone: '88780232'},
                    {name: '机械大楼值班室', phone: '88797438'},
                    {name: '材料大楼值班室', phone: '88780235'},
                    {name: '三江楼值班室', phone: '88790960'},
                    {name: '三山楼值班室', phone: '88791487'},
                    {name: '新校区东楼群值班室', phone: '88791389'},
                    {name: '京江学院大楼值班室', phone: '88979012'},
                    {name: '体育馆值班室', phone: '88797663'},
                    {name: 'A区管理员办公室', phone: '88780328'},
                    {name: 'A区总值班室', phone: '88780336'},
                    {name: 'A区1栋值班室', phone: '88797465'},
                    {name: 'A区2栋值班室', phone: '88780328'},
                    {name: 'A区3栋值班室', phone: '88797462'},
                    {name: 'A区4栋值班室', phone: '88797467'},
                    {name: 'A区5栋值班室', phone: '88780331'},
                    {name: 'A区6栋值班室', phone: '88780340'},
                    {name: 'A区7栋值班室', phone: '88780332'},
                    {name: '老生前楼', phone: '88791400'},
                    {name: '老生后楼', phone: '88798178'},
                    {name: 'B区管理员办公室', phone: '88979598'},
                    {name: 'B区总值班室', phone: '88979158'},
                    {name: 'B区1栋值班室', phone: '88979398'},
                    {name: 'B区2栋值班室', phone: '88979119'},
                    {name: 'B区3栋值班室', phone: '88979358'},
                    {name: 'B区4栋值班室', phone: '88979606'},
                    {name: 'B区5栋值班室', phone: '88979598'},
                    {name: 'B区6栋值班室', phone: '88979856'},
                    {name: 'C区管理员办公室', phone: '88780324'},
                    {name: 'C区1栋值班室', phone: '88780321'},
                    {name: 'C区2栋值班室', phone: '88780322'},
                    {name: 'C区3栋值班室', phone: '88780323'},
                    {name: 'C区4栋值班室', phone: '88780324'},
                    {name: 'C区5栋值班室', phone: '88780325'},
                    {name: 'C区6栋值班室', phone: '88780326'},
                    {name: 'C区10-11栋值班室', phone: '88791105'},
                    {name: 'D区管理员办公室', phone: '88791527'},
                    {name: 'D区1-2栋值班室', phone: '88791042'},
                    {name: 'D区3栋值班室', phone: '88791949'},
                    {name: 'D区4栋值班室', phone: '88780239'},
                    {name: 'D区5栋值班室', phone: '88797463'},
                    {name: 'D区6栋值班室', phone: '88791524'},
                    {name: 'D区7栋值班室', phone: '88791527'},
                    {name: 'D区8栋值班室', phone: '88797464'},
                    {name: 'E区管理员办公室', phone: '88791951'},
                    {name: 'D区9-10栋值班室', phone: '88791951'},
                    {name: 'E区1-3栋值班室', phone: '88791512'},
                    {name: 'E区4-5栋值班室', phone: '88791029'},
                    {name: 'E区6栋值班室', phone: '88792801'},
                    {name: 'F区管理员办公室', phone: '88972248'},
                    {name: 'F区1-2栋值班室', phone: '88792271'},
                    {name: 'F区3-4栋值班室', phone: '88792210'},
                    {name: 'F区5栋值班室', phone: '88792122'},
                    {name: 'F区6栋值班室', phone: '88792776'},
                    {name: 'F区7栋值班室', phone: '88792391'},
                    {name: 'F区8-9栋值班室', phone: '88972248'},
                    {name: 'G区管理员办公室', phone: '88978853'},
                    {name: 'G区1栋值班室', phone: '88979461'},
                    {name: 'G区2栋值班室', phone: '88979626'},
                    {name: 'G区3栋值班室', phone: '88978552'},
                    {name: 'G区4栋值班室', phone: '88978853'},
                    {name: 'G区5栋值班室', phone: '81884331'},
                    {name: 'G区5栋消防室', phone: '81884332'},
                    {name: '海外公寓管理员办公室', phone: '81884336'},
                    {name: 'C区7栋值班室', phone: '88780327'},
                    {name: 'C区8-9栋值班室', phone: '88780412'},
                    {name: 'G区6栋值班室', phone: '81884336'},
                    {name: '梦溪校区管理员办公室', phone: '84444076'},
                    {name: '梦溪校区门卫总值班室', phone: '84444119'},
                    {name: '梦溪校区消防值班室', phone: '84444889'},
                    {name: '梦溪校区1-2栋值班室', phone: '84445078'},
                    {name: '梦溪校区3栋(男)值班室', phone: '84445106'},
                    {name: '梦溪校区3栋(女)值班室', phone: '84448202'},
                    {name: '梦溪校区4栋值班室', phone: '84445096'},
                    {name: '北固校区管理员办公室', phone: '85038345'},
                    {name: '北固校区校内宿舍', phone: '85014996'},
                    {name: '北固校区东区宿舍', phone: '85038543'},
                ],
                content: '',
            }
        },
        computed: {
            conformItems() {
                var _this = this;
                var items = [];
                this.departments.map(function (department) {
                    if (department.name.search(_this.content) != -1) {
                        items.push(department);
                    }
                })
                return items;
            }
        }
    }
</script>

<style scoped>

</style>