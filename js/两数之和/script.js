var nums = [];  //随机数组
const len = 5;  //数组长度

// 左边区域的按钮事件，事件绑定在html的button 按钮中(事件绑定方式一，此时函数要有名字)
function handleClick() {
  let ul = document.querySelector('.list-group')  //获得左边的ul
  for (let i = 0; i < len; i++) {
    const num = parseInt(Math.random() * 100)  //生成随机数
    nums[i] = num//赋值给数组
    let li = document.createElement('li')  //创建li元素
    li.classList.add('list-group-item')  //给其添加样式
    li.innerText = num  //添加内容为本次生成的随机数
    ul.appendChild(li)  //将li作为子节点插入到ul,一个个精准控制
  }
  document.getElementById('nums').value = `${nums}`  //将右边区域的input元素内容赋值为生成的随机数数组(整体作为字符串的形式)
  document.getElementById('target').disabled = false  //右边区域的target数据输入框激活可用
}

// 右边区域的按钮，先找到它，然后绑定onclick事件为匿名函数，这里函数可以没有名字
document.getElementById('result').onclick = function () {
  let targetNode = document.getElementById('target')  //获取到target输入框
  let targetNumber = targetNode.value  //取得其中的值
  let result = twoSum(nums, targetNumber)  //调用封装的算法twoSum,得到返回值
  // 对返回结果进行判断，把结果显示在对应的元素中
  if (result !== undefined) {
    document.querySelector('#show').innerHTML = `${result}`
  } else {
    document.querySelector('#show').innerHTML = `No two sum solution`
  }
  targetNode.value = ''  //清空输入框，友好的的用户体验
}

// 此算法和Java没差别，注意JS形参，不需要指定类型，函数也不需要在前面声明返回值，有返回值，就return即可
var twoSum = function (nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (target - nums[i] === nums[j]) {
        return [i, j]
      }
    }
  }
  console.log("No two sum solution")  //并没有对无解的情况返回，只是打印一下，此时调用方法会得到unfined,这里也可以返回一个 -1
};

// 清空按钮事件
document.querySelector('#reset').onclick = function () {
  let lis = document.querySelectorAll('.list-group-item')  //找到所有的li元素
  for (let i = 0; i < lis.length; i++) {  //遍历
    lis[i].remove()  //移除自己
  }
}